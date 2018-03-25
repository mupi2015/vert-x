package experiment;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EntryPoint extends AbstractVerticle {


    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new EntryPoint());
    }


    @Override
    public void start(Future<Void> future) {
        log.info("Welcome to Vert-x");
    }

    @Override
    public void stop() {
        log.info("Shutting down application");
    }
}
