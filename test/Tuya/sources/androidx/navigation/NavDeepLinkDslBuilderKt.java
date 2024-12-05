package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class NavDeepLinkDslBuilderKt {
    public static final NavDeepLink navDeepLink(Function1 deepLinkBuilder) {
        AbstractC3159y.i(deepLinkBuilder, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        deepLinkBuilder.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }
}
