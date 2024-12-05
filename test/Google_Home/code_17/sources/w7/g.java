package w7;

import w7.o;

/* loaded from: classes5.dex */
final class g extends o {

    /* renamed from: e, reason: collision with root package name */
    private final int f40416e;

    /* renamed from: f, reason: collision with root package name */
    private final int f40417f;

    /* renamed from: g, reason: collision with root package name */
    private final int f40418g;

    private g(b bVar) {
        super(bVar);
        this.f40416e = 0;
        this.f40417f = bVar.f40419e;
        this.f40418g = bVar.f40420f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w7.o
    public byte[] d() {
        byte[] d8 = super.d();
        H7.f.d(this.f40416e, d8, 16);
        H7.f.d(this.f40417f, d8, 20);
        H7.f.d(this.f40418g, d8, 24);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f40417f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f40418g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a {

        /* renamed from: e, reason: collision with root package name */
        private int f40419e;

        /* renamed from: f, reason: collision with root package name */
        private int f40420f;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(2);
            this.f40419e = 0;
            this.f40420f = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o k() {
            return new g(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b m(int i8) {
            this.f40419e = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i8) {
            this.f40420f = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w7.o.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }
    }
}
