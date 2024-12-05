package com.mbridge.msdk.foundation.same.net.f;

import com.mbridge.msdk.foundation.same.net.g;
import com.mbridge.msdk.foundation.same.net.i;
import com.mbridge.msdk.foundation.same.net.l;

/* loaded from: classes4.dex */
public class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19649a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.net.c f19650b;

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.net.stack.b f19651c;

    public a(com.mbridge.msdk.foundation.same.net.stack.b bVar, com.mbridge.msdk.foundation.same.net.c cVar) {
        this.f19651c = bVar;
        this.f19650b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01de  */
    @Override // com.mbridge.msdk.foundation.same.net.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.mbridge.msdk.foundation.same.net.f.c a(com.mbridge.msdk.foundation.same.net.i<?> r17) throws com.mbridge.msdk.foundation.same.net.b.a {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.f.a.a(com.mbridge.msdk.foundation.same.net.i):com.mbridge.msdk.foundation.same.net.f.c");
    }

    private void a(i<?> iVar, com.mbridge.msdk.foundation.same.net.b.a aVar, long j8) throws com.mbridge.msdk.foundation.same.net.b.a {
        if (iVar != null && aVar != null) {
            try {
                l n8 = iVar.n();
                if (n8 != null) {
                    long f8 = n8.f();
                    if (!n8.a(aVar)) {
                        throw aVar;
                    }
                    if (j8 < f8) {
                        this.f19650b.e(iVar);
                        return;
                    }
                    throw aVar;
                }
                throw aVar;
            } catch (Exception unused) {
                throw aVar;
            }
        }
        throw new com.mbridge.msdk.foundation.same.net.b.a(4, null);
    }
}
