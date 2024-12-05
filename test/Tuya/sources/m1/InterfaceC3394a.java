package m1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC3394a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
