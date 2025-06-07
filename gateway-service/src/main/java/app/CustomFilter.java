package app;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomFilter implements GatewayFilterFactory<CustomFilter.Config> {
  @Override
  public GatewayFilter apply(CustomFilter.Config config) {
    return ((exchange, chain) -> {
      var request = exchange.getRequest()
          .mutate()
          .header("jwt-assertion", "123")
          .build();
      return chain.filter(exchange.mutate().request(request).build());
    });
  }

  @Override
  public Config newConfig() {
    return new Config();
  }

  @Override
  public Class<Config> getConfigClass() {
    return Config.class;
  }

  public static class Config{}
}
