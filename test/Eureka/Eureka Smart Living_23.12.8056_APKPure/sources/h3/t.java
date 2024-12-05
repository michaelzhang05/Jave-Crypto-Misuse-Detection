package h3;

import h3.v;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class t extends h3.b {

    /* renamed from: a, reason: collision with root package name */
    private final v f6917a;

    /* renamed from: b, reason: collision with root package name */
    private final v3.b f6918b;

    /* renamed from: c, reason: collision with root package name */
    private final v3.a f6919c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f6920d;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private v f6921a;

        /* renamed from: b, reason: collision with root package name */
        private v3.b f6922b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f6923c;

        private b() {
            this.f6921a = null;
            this.f6922b = null;
            this.f6923c = null;
        }

        private v3.a b() {
            if (this.f6921a.c() == v.c.f6931d) {
                return v3.a.a(new byte[0]);
            }
            if (this.f6921a.c() == v.c.f6930c) {
                return v3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f6923c.intValue()).array());
            }
            if (this.f6921a.c() == v.c.f6929b) {
                return v3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f6923c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f6921a.c());
        }

        public t a() {
            v vVar = this.f6921a;
            if (vVar == null || this.f6922b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (vVar.b() != this.f6922b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f6921a.d() && this.f6923c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f6921a.d() && this.f6923c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new t(this.f6921a, this.f6922b, b(), this.f6923c);
        }

        public b c(Integer num) {
            this.f6923c = num;
            return this;
        }

        public b d(v3.b bVar) {
            this.f6922b = bVar;
            return this;
        }

        public b e(v vVar) {
            this.f6921a = vVar;
            return this;
        }
    }

    private t(v vVar, v3.b bVar, v3.a aVar, Integer num) {
        this.f6917a = vVar;
        this.f6918b = bVar;
        this.f6919c = aVar;
        this.f6920d = num;
    }

    public static b a() {
        return new b();
    }
}
