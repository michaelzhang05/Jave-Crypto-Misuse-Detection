package v0;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface b {
    String name() default "";

    c[] permissions() default {};

    int[] requestCodes() default {};
}
