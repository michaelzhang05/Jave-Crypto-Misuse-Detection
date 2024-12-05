package F6;

import O5.I;
import a6.InterfaceC1668n;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2865a = new j();

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f2866a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map) {
            super(2);
            this.f2866a = map;
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            Boolean bool = (Boolean) obj2;
            bool.booleanValue();
            this.f2866a.put(String.valueOf(intValue), bool);
            return I.f8278a;
        }
    }

    public final PrivacyEncodingMode a(String str) {
        PrivacyEncodingMode privacyEncodingMode;
        if (str == null) {
            privacyEncodingMode = null;
        } else {
            String upperCase = str.toUpperCase(Locale.ROOT);
            AbstractC3255y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (AbstractC3255y.d(upperCase, "TCF")) {
                privacyEncodingMode = PrivacyEncodingMode.TCF;
            } else if (AbstractC3255y.d(upperCase, "GPP")) {
                privacyEncodingMode = PrivacyEncodingMode.GPP;
            } else {
                privacyEncodingMode = PrivacyEncodingMode.TCF_AND_GPP;
            }
        }
        if (privacyEncodingMode == null) {
            return PrivacyEncodingMode.TCF_AND_GPP;
        }
        return privacyEncodingMode;
    }

    public final Map b(Vector vector) {
        AbstractC3255y.i(vector, "vector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        vector.forEach(new a(linkedHashMap));
        return linkedHashMap;
    }

    public final Map c(Vector vector, Set set) {
        LinkedHashMap linkedHashMap;
        AbstractC3255y.i(vector, "vector");
        if (set == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                linkedHashMap2.put(String.valueOf(intValue), Boolean.valueOf(vector.contains(intValue)));
            }
            linkedHashMap = linkedHashMap2;
        }
        if (linkedHashMap == null) {
            return b(vector);
        }
        return linkedHashMap;
    }
}
