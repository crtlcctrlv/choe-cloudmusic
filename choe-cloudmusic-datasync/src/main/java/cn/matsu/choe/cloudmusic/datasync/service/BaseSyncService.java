package cn.matsu.choe.cloudmusic.datasync.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.alibaba.fastjson.JSONObject;

public class BaseSyncService {

  @Autowired
  private RestTemplate restTemplate;

  @Value("${cloudmusic.node.server.url.prefix}")
  private String urlPrefix;

  private String url(String path) {
    return urlPrefix + path;
  }

  protected JSONObject getBodyJson(String path, Object... uriVariables) {
    ResponseEntity<JSONObject> resp =
        restTemplate.getForEntity(url(path), JSONObject.class, uriVariables);

    return resp.getBody();
  }

}
