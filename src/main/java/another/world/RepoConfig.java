package another.world;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoConfig {
  @Bean(name = "repo")
  public Repo repo() {
    return new Repo();
  }
}
