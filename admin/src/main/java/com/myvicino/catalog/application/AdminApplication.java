package com.myvicino.catalog.application;

import com.myvicino.catalog.resources.AdminResource;
import com.myvicino.catalog.configuration.AdminConfiguration;
import com.myvicino.catalog.healthcheck.TemplateHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class AdminApplication extends Application<AdminConfiguration> {
    public static void main(String[] args) throws Exception {
        new AdminApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<AdminConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(AdminConfiguration configuration,
                    Environment environment) {
        final AdminResource resource = new AdminResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }

}
