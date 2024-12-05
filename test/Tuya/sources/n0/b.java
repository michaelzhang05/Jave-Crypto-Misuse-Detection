package N0;

import H0.AbstractC1184s;
import H0.E;
import J0.B;
import K0.h;
import O0.i;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import s.C3700b;
import s.InterfaceC3703e;
import s.g;
import u.u;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final h f7144c = new h();

    /* renamed from: d, reason: collision with root package name */
    private static final String f7145d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e, reason: collision with root package name */
    private static final String f7146e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f, reason: collision with root package name */
    private static final InterfaceC3703e f7147f = new InterfaceC3703e() { // from class: N0.a
        @Override // s.InterfaceC3703e
        public final Object apply(Object obj) {
            byte[] d8;
            d8 = b.d((B) obj);
            return d8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final e f7148a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3703e f7149b;

    b(e eVar, InterfaceC3703e interfaceC3703e) {
        this.f7148a = eVar;
        this.f7149b = interfaceC3703e;
    }

    public static b b(Context context, i iVar, E e8) {
        u.f(context);
        g g8 = u.c().g(new com.google.android.datatransport.cct.a(f7145d, f7146e));
        C3700b b8 = C3700b.b("json");
        InterfaceC3703e interfaceC3703e = f7147f;
        return new b(new e(g8.a("FIREBASE_CRASHLYTICS_REPORT", B.class, b8, interfaceC3703e), iVar.b(), e8), interfaceC3703e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(B b8) {
        return f7144c.G(b8).getBytes(Charset.forName(C.UTF8_NAME));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i8 = 0; i8 < str.length(); i8++) {
                sb.append(str.charAt(i8));
                if (str2.length() > i8) {
                    sb.append(str2.charAt(i8));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public Task c(AbstractC1184s abstractC1184s, boolean z8) {
        return this.f7148a.i(abstractC1184s, z8).a();
    }
}
