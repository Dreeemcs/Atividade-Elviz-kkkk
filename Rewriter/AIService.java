// Integração ultra-compacta com Groq API - usa variável de ambiente para chave
import java.io.*;import java.net.HttpURLConnection;import java.net.URL;import java.nio.charset.StandardCharsets;import java.util.Scanner;
public class AIService{
  // Chamada síncrona à Groq API: POST JSON, recebe resposta com IA
  // Usa variável de ambiente GROQ_API_KEY (seguro!)
  public static String call(String p){
    try{
      String key=System.getenv("GROQ_API_KEY");
      if(key==null||key.isEmpty())return""; // Sem chave = sem IA
      // Abre conexão HTTP para Groq
      HttpURLConnection c=(HttpURLConnection)new URL("https://api.groq.com/openai/v1/chat/completions").openConnection();
      c.setRequestMethod("POST");
      c.setRequestProperty("Content-Type","application/json");
      c.setRequestProperty("Authorization","Bearer "+key); // Chave da ambiente
      c.setConnectTimeout(10000);
      c.setReadTimeout(10000);
      c.setDoOutput(true);
      // Constrói JSON com mensagem de usuário
      String j="{\"messages\":[{\"role\":\"user\",\"content\":\""+p.replace("\"","\\\"")+"\"}],\"model\":\"mixtral-8x7b-32768\",\"temperature\":0.7,\"max_tokens\":500}";
      // Escreve JSON no corpo da requisição
      try(OutputStream o=c.getOutputStream()){o.write(j.getBytes(StandardCharsets.UTF_8));}
      // Se sucesso (200), extrai "content" da resposta
      if(c.getResponseCode()==200){
        String r=new Scanner(c.getInputStream(),StandardCharsets.UTF_8).useDelimiter("\\A").next();
        int i=r.indexOf("\"content\":\"");
        if(i>0)return r.substring(i+11,r.indexOf("\"",i+11)).replace("\\n","\n");
      }
      return"";
    }catch(Exception e){return"";}
  }
}
