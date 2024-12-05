package P0;

import J0.AbstractC1286v;
import J0.I;
import L0.F;
import M0.j;
import Q0.i;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import s.C3982c;
import s.h;
import u.u;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final j f8663c = new j();

    /* renamed from: d, reason: collision with root package name */
    private static final String f8664d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e, reason: collision with root package name */
    private static final String f8665e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f, reason: collision with root package name */
    private static final h f8666f = new h() { // from class: P0.a
        @Override // s.h
        public final Object apply(Object obj) {
            byte[] d8;
            d8 = b.d((F) obj);
            return d8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final e f8667a;

    /* renamed from: b, reason: collision with root package name */
    private final h f8668b;

    b(e eVar, h hVar) {
        this.f8667a = eVar;
        this.f8668b = hVar;
    }

    public static b b(Context context, i iVar, I i8) {
        u.f(context);
        s.j g8 = u.c().g(new com.google.android.datatransport.cct.a(f8664d, f8665e));
        C3982c b8 = C3982c.b("json");
        h hVar = f8666f;
        return new b(new e(g8.a("FIREBASE_CRASHLYTICS_REPORT", F.class, b8, hVar), iVar.b(), i8), hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(F f8) {
        return f8663c.M(f8).getBytes(Charset.forName(C.UTF8_NAME));
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

    public Task c(AbstractC1286v abstractC1286v, boolean z8) {
        return this.f8667a.i(abstractC1286v, z8).a();
    }
}
