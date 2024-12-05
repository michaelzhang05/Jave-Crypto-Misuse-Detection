package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class NamedNavArgumentKt {
    public static final NamedNavArgument navArgument(String name, Function1 builder) {
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(builder, "builder");
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        builder.invoke(navArgumentBuilder);
        return new NamedNavArgument(name, navArgumentBuilder.build());
    }
}
