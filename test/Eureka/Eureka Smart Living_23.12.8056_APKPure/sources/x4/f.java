package x4;

import java.sql.SQLException;

/* loaded from: classes.dex */
class f implements d {

    /* renamed from: a, reason: collision with root package name */
    private x4.a f9838a;

    /* loaded from: classes.dex */
    private class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private c f9839a;

        /* renamed from: b, reason: collision with root package name */
        private String f9840b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9841c = false;

        /* renamed from: d, reason: collision with root package name */
        private int f9842d = 0;

        a(String str) {
            this.f9839a = null;
            this.f9840b = str;
            this.f9839a = f.this.f9838a.c(str);
        }

        @Override // x4.g
        public void a(int i6, long j6) {
            c cVar = this.f9839a;
            if (cVar == null) {
                throw new SQLException("already disposed", "failed", 21);
            }
            int a6 = cVar.a(i6, j6);
            if (a6 == 0) {
                return;
            }
            throw new SQLException("sqlite3_bind_int64 (long) failure: " + f.this.f9838a.e(), "failure", a6);
        }

        @Override // x4.g
        public void b(int i6) {
            c cVar = this.f9839a;
            if (cVar == null) {
                throw new SQLException("already disposed", "failed", 21);
            }
            int b6 = cVar.b(i6);
            if (b6 == 0) {
                return;
            }
            throw new SQLException("sqlite3_bind_null failure: " + f.this.f9838a.e(), "failure", b6);
        }

        @Override // x4.g
        public void c(int i6, double d6) {
            c cVar = this.f9839a;
            if (cVar == null) {
                throw new SQLException("already disposed", "failed", 21);
            }
            int c6 = cVar.c(i6, d6);
            if (c6 == 0) {
                return;
            }
            throw new SQLException("sqlite3_bind_double failure: " + f.this.f9838a.e(), "failure", c6);
        }

        @Override // x4.g
        public void d() {
            c cVar = this.f9839a;
            if (cVar == null) {
                throw new SQLException("already disposed", "failed", 21);
            }
            cVar.k();
            this.f9839a = null;
        }

        @Override // x4.g
        public double e(int i6) {
            c cVar = this.f9839a;
            if (cVar == null) {
                throw new SQLException("already disposed", "failed", 21);
            }
            if (!this.f9841c) {
                throw new SQLException("no result available", "failed", 21);
            }
            if (i6 < 0 || i6 >= this.f9842d) {
                throw new SQLException("no result available", "failed", 21);
            }
            return cVar.e(i6);
        }

        @Override // x4.g
        public String f(int i6) {
            c cVar = this.f9839a;
            if (cVar == null) {
                throw new SQLException("already disposed", "failed", 21);
            }
            if (!this.f9841c) {
                throw new SQLException("no result available", "failed", 21);
            }
            if (i6 < 0 || i6 >= this.f9842d) {
                throw new SQLException("no result available", "failed", 21);
            }
            return cVar.f(i6);
        }

        @Override // x4.g
        public boolean g() {
            c cVar = this.f9839a;
            if (cVar == null) {
                throw new SQLException("already disposed", "failed", 21);
            }
            int g6 = cVar.g();
            if (g6 != 0 && g6 != 100 && g6 != 101) {
                throw new SQLException("sqlite3_step failure: " + f.this.f9838a.e(), "failure", g6);
            }
            boolean z5 = g6 == 100;
            this.f9841c = z5;
            if (z5) {
                this.f9842d = this.f9839a.getColumnCount();
            } else {
                this.f9842d = 0;
            }
            return this.f9841c;
        }

        @Override // x4.g
        public int getColumnCount() {
            if (this.f9839a == null) {
                throw new SQLException("already disposed", "failed", 21);
            }
            if (this.f9841c) {
                return this.f9842d;
            }
            throw new SQLException("no result available", "failed", 21);
        }

        @Override // x4.g
        public String getColumnName(int i6) {
            c cVar = this.f9839a;
            if (cVar == null) {
                throw new SQLException("already disposed", "failed", 21);
            }
            if (!this.f9841c) {
                throw new SQLException("no result available", "failed", 21);
            }
            if (i6 < 0 || i6 >= this.f9842d) {
                throw new SQLException("no result available", "failed", 21);
            }
            return cVar.getColumnName(i6);
        }

        @Override // x4.g
        public long h(int i6) {
            c cVar = this.f9839a;
            if (cVar == null) {
                throw new SQLException("already disposed", "failed", 21);
            }
            if (!this.f9841c) {
                throw new SQLException("no result available", "failed", 21);
            }
            if (i6 < 0 || i6 >= this.f9842d) {
                throw new SQLException("no result available", "failed", 21);
            }
            return cVar.h(i6);
        }

        @Override // x4.g
        public void i(int i6, String str) {
            c cVar = this.f9839a;
            if (cVar == null) {
                throw new SQLException("already disposed", "failed", 21);
            }
            if (str == null) {
                throw new SQLException("null argument", "failed", 21);
            }
            int i7 = cVar.i(i6, str);
            if (i7 == 0) {
                return;
            }
            throw new SQLException("sqlite3_bind_text failure: " + f.this.f9838a.e(), "failure", i7);
        }

        @Override // x4.g
        public int j(int i6) {
            c cVar = this.f9839a;
            if (cVar == null) {
                throw new SQLException("already disposed", "failed", 21);
            }
            if (!this.f9841c) {
                throw new SQLException("no result available", "failed", 21);
            }
            if (i6 < 0 || i6 >= this.f9842d) {
                throw new SQLException("no result available", "failed", 21);
            }
            return cVar.j(i6);
        }

        int k() {
            return this.f9839a.l();
        }
    }

    public f(String str, int i6) {
        this.f9838a = null;
        if (str == null) {
            throw new SQLException("null argument", "failed", 21);
        }
        b bVar = new b(str, i6);
        int d6 = bVar.d();
        if (d6 == 0) {
            this.f9838a = bVar;
            return;
        }
        throw new SQLException("sqlite3_open_v2 failure: " + bVar.e(), "failure", d6);
    }

    @Override // x4.d
    public int a() {
        x4.a aVar = this.f9838a;
        if (aVar != null) {
            return aVar.a();
        }
        throw new SQLException("already disposed", "failed", 21);
    }

    @Override // x4.d
    public long b() {
        x4.a aVar = this.f9838a;
        if (aVar != null) {
            return aVar.b();
        }
        throw new SQLException("already disposed", "failed", 21);
    }

    @Override // x4.d
    public void d() {
        x4.a aVar = this.f9838a;
        if (aVar == null) {
            throw new SQLException("already disposed", "failed", 21);
        }
        int close = aVar.close();
        if (close == 0) {
            this.f9838a = null;
            return;
        }
        throw new SQLException("sqlite3_close failure: " + this.f9838a.e(), "failure", close);
    }

    @Override // x4.d
    public g e(String str) {
        if (this.f9838a == null) {
            throw new SQLException("already disposed", "failed", 21);
        }
        if (str == null) {
            throw new SQLException("null argument", "failed", 21);
        }
        a aVar = new a(str);
        int k6 = aVar.k();
        if (k6 == 0) {
            return aVar;
        }
        throw new SQLException("sqlite3_prepare_v2 failure: " + this.f9838a.e(), "failure", k6);
    }
}
