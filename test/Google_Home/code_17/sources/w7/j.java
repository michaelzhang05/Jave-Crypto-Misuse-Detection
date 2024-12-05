package w7;

import w7.o;

/* loaded from: classes5.dex */
final class j extends o {

    /* renamed from: e, reason: collision with root package name */
    private final int f40429e;

    /* renamed from: f, reason: collision with root package name */
    private final int f40430f;

    /* renamed from: g, reason: collision with root package name */
    private final int f40431g;

    private j(b bVar) {
        super(bVar);
        this.f40429e = bVar.f40432e;
        this.f40430f = bVar.f40433f;
        this.f40431g = bVar.f40434g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w7.o
    public byte[] d() {
        byte[] d8 = super.d();
        H7.f.d(this.f40429e, d8, 16);
        H7.f.d(this.f40430f, d8, 20);
        H7.f.d(this.f40431g, d8, 24);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f40430f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f40431g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int g() {
        return this.f40429e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a {

        /* renamed from: e, reason: collision with root package name */
        private int f40432e;

        /* renamed from: f, reason: collision with root package name */
        private int f40433f;

        /* renamed from: g, reason: collision with root package name */
        private int f40434g;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(0);
            this.f40432e = 0;
            this.f40433f = 0;
            this.f40434g = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o l() {
            return new j(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i8) {
            this.f40433f = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b o(int i8) {
            this.f40434g = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b p(int i8) {
            this.f40432e = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w7.o.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }
    }
}
