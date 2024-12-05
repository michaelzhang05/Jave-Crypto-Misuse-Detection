package c5;

import android.content.Context;
import d5.InterfaceC2755a;
import f5.C2840e;
import f5.k;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.N;

/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2047a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15729a;

    public C2047a(Context context) {
        AbstractC3255y.i(context, "context");
        this.f15729a = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|53|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0040, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        r7.printStackTrace();
        r8 = l6.C3347b0.c();
        r10 = new c5.i(r9, r7, null);
        r2.f15734a = null;
        r2.f15737d = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0119, code lost:
    
        if (l6.AbstractC3360i.g(r8, r10, r2) == r3) goto L57;
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
    public static final java.lang.Object b(c5.C2047a r7, f5.C2839d r8, d5.InterfaceC2755a r9, S5.d r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.C2047a.b(c5.a, f5.d, d5.a, S5.d):java.lang.Object");
    }

    public final void c(String token, InterfaceC2755a initListener) {
        AbstractC3255y.i(token, "token");
        AbstractC3255y.i(initListener, "initListener");
        if (new C2840e(this.f15729a).a() != k.f31966a.d(this.f15729a)) {
            AbstractC3364k.d(N.a(C3347b0.b()), null, null, new C2048b(this, token, initListener, null), 3, null);
        } else {
            initListener.c();
        }
    }
}
