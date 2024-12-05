package p1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC3737a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
