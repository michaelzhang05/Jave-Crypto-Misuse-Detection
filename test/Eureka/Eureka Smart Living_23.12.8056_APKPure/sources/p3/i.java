package p3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p3.l;

/* loaded from: classes.dex */
public final class i extends p {

    /* renamed from: a, reason: collision with root package name */
    private final l f8837a;

    /* renamed from: b, reason: collision with root package name */
    private final v3.b f8838b;

    /* renamed from: c, reason: collision with root package name */
    private final v3.a f8839c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f8840d;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private l f8841a;

        /* renamed from: b, reason: collision with root package name */
        private v3.b f8842b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f8843c;

        private b() {
            this.f8841a = null;
            this.f8842b = null;
            this.f8843c = null;
        }

        private v3.a b() {
            if (this.f8841a.f() == l.d.f8864e) {
                return v3.a.a(new byte[0]);
            }
            if (this.f8841a.f() == l.d.f8863d || this.f8841a.f() == l.d.f8862c) {
                return v3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f8843c.intValue()).array());
            }
            if (this.f8841a.f() == l.d.f8861b) {
                return v3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f8843c.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f8841a.f());
        }

        public i a() {
            l lVar = this.f8841a;
            if (lVar == null || this.f8842b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (lVar.d() != this.f8842b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f8841a.g() && this.f8843c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f8841a.g() && this.f8843c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f8841a, this.f8842b, b(), this.f8843c);
        }

        public b c(Integer num) {
            this.f8843c = num;
            return this;
        }

        public b d(v3.b bVar) {
            this.f8842b = bVar;
            return this;
        }

        public b e(l lVar) {
            this.f8841a = lVar;
            return this;
        }
    }

    private i(l lVar, v3.b bVar, v3.a aVar, Integer num) {
        this.f8837a = lVar;
        this.f8838b = bVar;
        this.f8839c = aVar;
        this.f8840d = num;
    }

    public static b c() {
        return new b();
    }

    @Override // p3.p
    public v3.a a() {
        return this.f8839c;
    }

    @Override // p3.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public l b() {
        return this.f8837a;
    }
}
