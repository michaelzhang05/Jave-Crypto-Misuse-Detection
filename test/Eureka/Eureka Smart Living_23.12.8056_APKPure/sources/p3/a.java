package p3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p3.d;

/* loaded from: classes.dex */
public final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    private final d f8809a;

    /* renamed from: b, reason: collision with root package name */
    private final v3.b f8810b;

    /* renamed from: c, reason: collision with root package name */
    private final v3.a f8811c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f8812d;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private d f8813a;

        /* renamed from: b, reason: collision with root package name */
        private v3.b f8814b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f8815c;

        private b() {
            this.f8813a = null;
            this.f8814b = null;
            this.f8815c = null;
        }

        private v3.a b() {
            if (this.f8813a.e() == d.c.f8827e) {
                return v3.a.a(new byte[0]);
            }
            if (this.f8813a.e() == d.c.f8826d || this.f8813a.e() == d.c.f8825c) {
                return v3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f8815c.intValue()).array());
            }
            if (this.f8813a.e() == d.c.f8824b) {
                return v3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f8815c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f8813a.e());
        }

        public a a() {
            d dVar = this.f8813a;
            if (dVar == null || this.f8814b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (dVar.c() != this.f8814b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f8813a.f() && this.f8815c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f8813a.f() && this.f8815c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f8813a, this.f8814b, b(), this.f8815c);
        }

        public b c(v3.b bVar) {
            this.f8814b = bVar;
            return this;
        }

        public b d(Integer num) {
            this.f8815c = num;
            return this;
        }

        public b e(d dVar) {
            this.f8813a = dVar;
            return this;
        }
    }

    private a(d dVar, v3.b bVar, v3.a aVar, Integer num) {
        this.f8809a = dVar;
        this.f8810b = bVar;
        this.f8811c = aVar;
        this.f8812d = num;
    }

    public static b c() {
        return new b();
    }

    @Override // p3.p
    public v3.a a() {
        return this.f8811c;
    }

    @Override // p3.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d b() {
        return this.f8809a;
    }
}
