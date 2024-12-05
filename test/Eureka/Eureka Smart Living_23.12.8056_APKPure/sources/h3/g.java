package h3;

import h3.i;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class g extends h3.b {

    /* renamed from: a, reason: collision with root package name */
    private final i f6849a;

    /* renamed from: b, reason: collision with root package name */
    private final v3.b f6850b;

    /* renamed from: c, reason: collision with root package name */
    private final v3.a f6851c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f6852d;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private i f6853a;

        /* renamed from: b, reason: collision with root package name */
        private v3.b f6854b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f6855c;

        private b() {
            this.f6853a = null;
            this.f6854b = null;
            this.f6855c = null;
        }

        private v3.a b() {
            if (this.f6853a.e() == i.c.f6872d) {
                return v3.a.a(new byte[0]);
            }
            if (this.f6853a.e() == i.c.f6871c) {
                return v3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f6855c.intValue()).array());
            }
            if (this.f6853a.e() == i.c.f6870b) {
                return v3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f6855c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f6853a.e());
        }

        public g a() {
            i iVar = this.f6853a;
            if (iVar == null || this.f6854b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (iVar.c() != this.f6854b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f6853a.f() && this.f6855c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f6853a.f() && this.f6855c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new g(this.f6853a, this.f6854b, b(), this.f6855c);
        }

        public b c(Integer num) {
            this.f6855c = num;
            return this;
        }

        public b d(v3.b bVar) {
            this.f6854b = bVar;
            return this;
        }

        public b e(i iVar) {
            this.f6853a = iVar;
            return this;
        }
    }

    private g(i iVar, v3.b bVar, v3.a aVar, Integer num) {
        this.f6849a = iVar;
        this.f6850b = bVar;
        this.f6851c = aVar;
        this.f6852d = num;
    }

    public static b a() {
        return new b();
    }
}
