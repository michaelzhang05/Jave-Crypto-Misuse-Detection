package t7;

import t7.o;

/* loaded from: classes5.dex */
final class i extends o {

    /* renamed from: e, reason: collision with root package name */
    private final int f38296e;

    /* renamed from: f, reason: collision with root package name */
    private final int f38297f;

    /* renamed from: g, reason: collision with root package name */
    private final int f38298g;

    private i(b bVar) {
        super(bVar);
        this.f38296e = bVar.f38299e;
        this.f38297f = bVar.f38300f;
        this.f38298g = bVar.f38301g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t7.o
    public byte[] d() {
        byte[] d8 = super.d();
        E7.f.d(this.f38296e, d8, 16);
        E7.f.d(this.f38297f, d8, 20);
        E7.f.d(this.f38298g, d8, 24);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f38296e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f38297f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int g() {
        return this.f38298g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a {

        /* renamed from: e, reason: collision with root package name */
        private int f38299e;

        /* renamed from: f, reason: collision with root package name */
        private int f38300f;

        /* renamed from: g, reason: collision with root package name */
        private int f38301g;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(1);
            this.f38299e = 0;
            this.f38300f = 0;
            this.f38301g = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o l() {
            return new i(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i8) {
            this.f38299e = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b o(int i8) {
            this.f38300f = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b p(int i8) {
            this.f38301g = i8;
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
