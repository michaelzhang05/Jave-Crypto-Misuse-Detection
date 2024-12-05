package com.bumptech.glide.load.n;

import com.bumptech.glide.load.m.d;
import com.bumptech.glide.load.n.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader.java */
/* loaded from: classes.dex */
public class b<Data> implements n<byte[], Data> {
    private final InterfaceC0117b<Data> a;

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: com.bumptech.glide.load.n.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0116a implements InterfaceC0117b<ByteBuffer> {
            C0116a() {
            }

            @Override // com.bumptech.glide.load.n.b.InterfaceC0117b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.n.b.InterfaceC0117b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.n.o
        public n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0116a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: com.bumptech.glide.load.n.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0117b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class c<Data> implements com.bumptech.glide.load.m.d<Data> {

        /* renamed from: f, reason: collision with root package name */
        private final byte[] f8702f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC0117b<Data> f8703g;

        c(byte[] bArr, InterfaceC0117b<Data> interfaceC0117b) {
            this.f8702f = bArr;
            this.f8703g = interfaceC0117b;
        }

        @Override // com.bumptech.glide.load.m.d
        public Class<Data> a() {
            return this.f8703g.a();
        }

        @Override // com.bumptech.glide.load.m.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.m.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.m.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.m.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            aVar.g(this.f8703g.b(this.f8702f));
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class d implements o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* loaded from: classes.dex */
        class a implements InterfaceC0117b<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.n.b.InterfaceC0117b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.n.b.InterfaceC0117b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.n.o
        public n<byte[], InputStream> b(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0117b<Data> interfaceC0117b) {
        this.a = interfaceC0117b;
    }

    @Override // com.bumptech.glide.load.n.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(byte[] bArr, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.q.c(bArr), new c(bArr, this.a));
    }

    @Override // com.bumptech.glide.load.n.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(byte[] bArr) {
        return true;
    }
}
