package C6;

import L5.I;
import X5.n;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1355a = new j();

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f1356a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map) {
            super(2);
            this.f1356a = map;
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            Boolean bool = (Boolean) obj2;
            bool.booleanValue();
            this.f1356a.put(String.valueOf(intValue), bool);
            return I.f6487a;
        }
    }

    public final PrivacyEncodingMode a(String str) {
        PrivacyEncodingMode privacyEncodingMode;
        if (str == null) {
            privacyEncodingMode = null;
        } else {
            String upperCase = str.toUpperCase(Locale.ROOT);
            AbstractC3159y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (AbstractC3159y.d(upperCase, "TCF")) {
                privacyEncodingMode = PrivacyEncodingMode.TCF;
            } else if (AbstractC3159y.d(upperCase, "GPP")) {
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
        AbstractC3159y.i(vector, "vector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        vector.forEach(new a(linkedHashMap));
        return linkedHashMap;
    }

    public final Map c(Vector vector, Set set) {
        LinkedHashMap linkedHashMap;
        AbstractC3159y.i(vector, "vector");
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
