package org.user.configuration;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;
import jakarta.ws.rs.ext.ContextResolver;
import jakarta.ws.rs.ext.Provider;
import jakarta.json.bind.config.PropertyOrderStrategy;

@Provider
public class JSONBConfiguration implements ContextResolver<Jsonb> {

    private final Jsonb jsonb;

    public JSONBConfiguration() {
        //Opcionalmente también puedes incluir una estrategia de orden de propiedades
        JsonbConfig config = new JsonbConfig()
                .withDateFormat("yyyy-MM-dd", null)
                .withPropertyOrderStrategy(PropertyOrderStrategy.LEXICOGRAPHICAL);

        jsonb = JsonbBuilder.create(config);
    }

    @Override
    public Jsonb getContext(Class<?> type) {
        return jsonb;
    }
}
