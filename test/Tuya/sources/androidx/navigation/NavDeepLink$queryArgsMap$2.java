package androidx.navigation;

import androidx.navigation.NavDeepLink;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavDeepLink$queryArgsMap$2 extends AbstractC3160z implements Function0 {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$queryArgsMap$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, NavDeepLink.ParamQuery> invoke() {
        Map<String, NavDeepLink.ParamQuery> parseQuery;
        parseQuery = this.this$0.parseQuery();
        return parseQuery;
    }
}
