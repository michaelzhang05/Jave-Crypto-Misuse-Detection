package h3;

import h3.q;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class o extends h3.b {

    /* renamed from: a, reason: collision with root package name */
    private final q f6891a;

    /* renamed from: b, reason: collision with root package name */
    private final v3.b f6892b;

    /* renamed from: c, reason: collision with root package name */
    private final v3.a f6893c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f6894d;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private q f6895a;

        /* renamed from: b, reason: collision with root package name */
        private v3.b f6896b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f6897c;

        private b() {
            this.f6895a = null;
            this.f6896b = null;
            this.f6897c = null;
        }

        private v3.a b() {
            if (this.f6895a.e() == q.c.f6909d) {
                return v3.a.a(new byte[0]);
            }
            if (this.f6895a.e() == q.c.f6908c) {
                return v3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f6897c.intValue()).array());
            }
            if (this.f6895a.e() == q.c.f6907b) {
                return v3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f6897c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f6895a.e());
        }

        public o a() {
            q qVar = this.f6895a;
            if (qVar == null || this.f6896b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (qVar.c() != this.f6896b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f6895a.f() && this.f6897c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f6895a.f() && this.f6897c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new o(this.f6895a, this.f6896b, b(), this.f6897c);
        }

        public b c(Integer num) {
            this.f6897c = num;
            return this;
        }

        public b d(v3.b bVar) {
            this.f6896b = bVar;
            return this;
        }

        public b e(q qVar) {
            this.f6895a = qVar;
            return this;
        }
    }

    private o(q qVar, v3.b bVar, v3.a aVar, Integer num) {
        this.f6891a = qVar;
        this.f6892b = bVar;
        this.f6893c = aVar;
        this.f6894d = num;
    }

    public static b a() {
        return new b();
    }
}
