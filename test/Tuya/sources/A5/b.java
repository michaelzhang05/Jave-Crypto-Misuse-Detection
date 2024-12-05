package A5;

import L5.I;
import X5.n;
import com.inmobi.cmp.core.model.Vector;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.T;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f486a = new b();

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T f487a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t8) {
            super(2);
            this.f487a = t8;
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            char c8;
            int intValue = ((Number) obj).intValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (intValue > 0 && intValue <= g6.n.M((CharSequence) this.f487a.f33761a) + 1) {
                T t8 = this.f487a;
                StringBuilder sb = new StringBuilder((String) t8.f33761a);
                int i8 = intValue - 1;
                if (booleanValue) {
                    c8 = '1';
                } else {
                    c8 = '0';
                }
                sb.setCharAt(i8, c8);
                String sb2 = sb.toString();
                AbstractC3159y.h(sb2, "StringBuilder(result).ap…             }.toString()");
                t8.f33761a = sb2;
            }
            return I.f6487a;
        }
    }

    public final String a(Vector vector) {
        AbstractC3159y.i(vector, "vector");
        T t8 = new T();
        t8.f33761a = g6.n.w(MBridgeConstans.ENDCARD_URL_TYPE_PL, vector.getMaxId());
        vector.forEach(new a(t8));
        return (String) t8.f33761a;
    }
}
