package com.stripe.android.view;

import com.stripe.android.view.ShippingInfoWidget;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f27391a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Map f27392b = M5.Q.e(L5.x.a(Locale.US.getCountry(), Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$")));

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(List list, List list2) {
            ShippingInfoWidget.a aVar = ShippingInfoWidget.a.f27608d;
            if (!list.contains(aVar) && !list2.contains(aVar)) {
                return false;
            }
            return true;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public final boolean a(String postalCode, String str, List optionalShippingInfoFields, List hiddenShippingInfoFields) {
        Matcher matcher;
        AbstractC3159y.i(postalCode, "postalCode");
        AbstractC3159y.i(optionalShippingInfoFields, "optionalShippingInfoFields");
        AbstractC3159y.i(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        if (str == null) {
            return false;
        }
        if (!g6.n.u(postalCode) || !f27391a.b(optionalShippingInfoFields, hiddenShippingInfoFields)) {
            Pattern pattern = (Pattern) f27392b.get(str);
            if (pattern != null && (matcher = pattern.matcher(postalCode)) != null) {
                return matcher.matches();
            }
            if (v2.d.f38784a.a(str) && !(!g6.n.u(postalCode))) {
                return false;
            }
        }
        return true;
    }
}
