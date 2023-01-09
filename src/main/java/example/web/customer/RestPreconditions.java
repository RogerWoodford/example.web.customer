package example.web.customer;

import javax.management.InstanceNotFoundException;

public class RestPreconditions {

        public static <T> T checkFound(T resource) {
            if (resource == null) {
                throw new IllegalArgumentException();
            }
            return resource;
        }

    public static void checkNotNull(Object byId) {
    }
}
