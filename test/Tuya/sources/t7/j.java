package t7;

import t7.o;

/* loaded from: classes5.dex */
final class j extends o {

    /* renamed from: e, reason: collision with root package name */
    private final int f38302e;

    /* renamed from: f, reason: collision with root package name */
    private final int f38303f;

    /* renamed from: g, reason: collision with root package name */
    private final int f38304g;

    private j(b bVar) {
        super(bVar);
        this.f38302e = bVar.f38305e;
        this.f38303f = bVar.f38306f;
        this.f38304g = bVar.f38307g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t7.o
    public byte[] d() {
        byte[] d8 = super.d();
        E7.f.d(this.f38302e, d8, 16);
        E7.f.d(this.f38303f, d8, 20);
        E7.f.d(this.f38304g, d8, 24);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f38303f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f38304g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int g() {
        return this.f38302e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a {

        /* renamed from: e, reason: collision with root package name */
        private int f38305e;

        /* renamed from: f, reason: collision with root package name */
        private int f38306f;

        /* renamed from: g, reason: collision with root package name */
        private int f38307g;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(0);
            this.f38305e = 0;
            this.f38306f = 0;
            this.f38307g = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o l() {
            return new j(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i8) {
            this.f38306f = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b o(int i8) {
            this.f38307g = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b p(int i8) {
            this.f38305e = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // t7.o.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }
    }
}
