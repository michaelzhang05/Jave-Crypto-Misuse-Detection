package w7;

import w7.o;

/* loaded from: classes5.dex */
final class i extends o {

    /* renamed from: e, reason: collision with root package name */
    private final int f40423e;

    /* renamed from: f, reason: collision with root package name */
    private final int f40424f;

    /* renamed from: g, reason: collision with root package name */
    private final int f40425g;

    private i(b bVar) {
        super(bVar);
        this.f40423e = bVar.f40426e;
        this.f40424f = bVar.f40427f;
        this.f40425g = bVar.f40428g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w7.o
    public byte[] d() {
        byte[] d8 = super.d();
        H7.f.d(this.f40423e, d8, 16);
        H7.f.d(this.f40424f, d8, 20);
        H7.f.d(this.f40425g, d8, 24);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f40423e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f40424f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int g() {
        return this.f40425g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a {

        /* renamed from: e, reason: collision with root package name */
        private int f40426e;

        /* renamed from: f, reason: collision with root package name */
        private int f40427f;

        /* renamed from: g, reason: collision with root package name */
        private int f40428g;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(1);
            this.f40426e = 0;
            this.f40427f = 0;
            this.f40428g = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o l() {
            return new i(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i8) {
            this.f40426e = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b o(int i8) {
            this.f40427f = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b p(int i8) {
            this.f40428g = i8;
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
