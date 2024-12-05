package o3;

import java.security.GeneralSecurityException;
import t3.i0;
import t3.y;

/* loaded from: classes.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    private final String f8257a;

    /* renamed from: b, reason: collision with root package name */
    private final v3.a f8258b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.crypto.tink.shaded.protobuf.h f8259c;

    /* renamed from: d, reason: collision with root package name */
    private final y.c f8260d;

    /* renamed from: e, reason: collision with root package name */
    private final i0 f8261e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f8262f;

    private o(String str, com.google.crypto.tink.shaded.protobuf.h hVar, y.c cVar, i0 i0Var, Integer num) {
        this.f8257a = str;
        this.f8258b = t.e(str);
        this.f8259c = hVar;
        this.f8260d = cVar;
        this.f8261e = i0Var;
        this.f8262f = num;
    }

    public static o b(String str, com.google.crypto.tink.shaded.protobuf.h hVar, y.c cVar, i0 i0Var, Integer num) {
        if (i0Var == i0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(str, hVar, cVar, i0Var, num);
    }

    @Override // o3.q
    public v3.a a() {
        return this.f8258b;
    }

    public Integer c() {
        return this.f8262f;
    }

    public y.c d() {
        return this.f8260d;
    }

    public i0 e() {
        return this.f8261e;
    }

    public String f() {
        return this.f8257a;
    }

    public com.google.crypto.tink.shaded.protobuf.h g() {
        return this.f8259c;
    }
}
