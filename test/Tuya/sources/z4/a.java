package Z4;

import a5.InterfaceC1575a;
import android.content.Context;
import c5.C1930e;
import c5.k;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.N;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13405a;

    public a(Context context) {
        AbstractC3159y.i(context, "context");
        this.f13405a = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|53|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0040, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        r7.printStackTrace();
        r8 = i6.C2812b0.c();
        r10 = new Z4.i(r9, r7, null);
        r2.f13410a = null;
        r2.f13413d = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0119, code lost:
    
        if (i6.AbstractC2825i.g(r8, r10, r2) == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0028. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(Z4.a r7, c5.C1929d r8, a5.InterfaceC1575a r9, P5.d r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.a.b(Z4.a, c5.d, a5.a, P5.d):java.lang.Object");
    }

    public final void c(String token, InterfaceC1575a initListener) {
        AbstractC3159y.i(token, "token");
        AbstractC3159y.i(initListener, "initListener");
        if (new C1930e(this.f13405a).a() != k.f14991a.d(this.f13405a)) {
            AbstractC2829k.d(N.a(C2812b0.b()), null, null, new b(this, token, initListener, null), 3, null);
        } else {
            initListener.c();
        }
    }
}
