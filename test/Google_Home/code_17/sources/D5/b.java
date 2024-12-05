package D5;

import O5.I;
import a6.InterfaceC1668n;
import com.inmobi.cmp.core.model.Vector;
import com.mbridge.msdk.MBridgeConstans;
import j6.n;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.T;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2208a = new b();

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T f2209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t8) {
            super(2);
            this.f2209a = t8;
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            char c8;
            int intValue = ((Number) obj).intValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (intValue > 0 && intValue <= n.M((CharSequence) this.f2209a.f34162a) + 1) {
                T t8 = this.f2209a;
                StringBuilder sb = new StringBuilder((String) t8.f34162a);
                int i8 = intValue - 1;
                if (booleanValue) {
                    c8 = '1';
                } else {
                    c8 = '0';
                }
                sb.setCharAt(i8, c8);
                String sb2 = sb.toString();
                AbstractC3255y.h(sb2, "StringBuilder(result).ap…             }.toString()");
                t8.f34162a = sb2;
            }
            return I.f8278a;
        }
    }

    public final String a(Vector vector) {
        AbstractC3255y.i(vector, "vector");
        T t8 = new T();
        t8.f34162a = n.w(MBridgeConstans.ENDCARD_URL_TYPE_PL, vector.getMaxId());
        vector.forEach(new a(t8));
        return (String) t8.f34162a;
    }
}
