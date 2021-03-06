package com.example;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import io.micronaut.azure.function.AzureFunction;

/**
 * Azure Functions with HTTP Trigger.
 */
public class Function extends AzureFunction {
    public String echo(
        @HttpTrigger(name = "req", methods = HttpMethod.POST, authLevel = AuthorizationLevel.ANONYMOUS)
        String req,
        ExecutionContext context) {
        if (context != null) {
            context.getLogger().info("Executing Function: " + getClass().getName());
        }
        return String.format(req);
    }
}
