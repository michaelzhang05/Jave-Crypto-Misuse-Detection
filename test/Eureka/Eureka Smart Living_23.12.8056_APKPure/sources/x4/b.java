package x4;

import io.liteglue.SQLiteNDKNativeDriver;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    String f9831a;

    /* renamed from: b, reason: collision with root package name */
    int f9832b;

    /* renamed from: c, reason: collision with root package name */
    private long f9833c = 0;

    /* renamed from: x4.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0148b implements c {

        /* renamed from: a, reason: collision with root package name */
        String f9834a;

        /* renamed from: b, reason: collision with root package name */
        private long f9835b;

        private C0148b(String str) {
            this.f9835b = 0L;
            this.f9834a = str;
        }

        @Override // x4.c
        public int a(int i6, long j6) {
            long j7 = this.f9835b;
            if (j7 == 0) {
                return 21;
            }
            return SQLiteNDKNativeDriver.sqlc_st_bind_long(j7, i6, j6);
        }

        @Override // x4.c
        public int b(int i6) {
            long j6 = this.f9835b;
            if (j6 == 0) {
                return 21;
            }
            return SQLiteNDKNativeDriver.sqlc_st_bind_null(j6, i6);
        }

        @Override // x4.c
        public int c(int i6, double d6) {
            long j6 = this.f9835b;
            if (j6 == 0) {
                return 21;
            }
            return SQLiteNDKNativeDriver.sqlc_st_bind_double(j6, i6, d6);
        }

        @Override // x4.c
        public double e(int i6) {
            long j6 = this.f9835b;
            if (j6 == 0) {
                return -1.0d;
            }
            return SQLiteNDKNativeDriver.sqlc_st_column_double(j6, i6);
        }

        @Override // x4.c
        public String f(int i6) {
            long j6 = this.f9835b;
            if (j6 == 0) {
                return null;
            }
            return SQLiteNDKNativeDriver.sqlc_st_column_text_native(j6, i6);
        }

        @Override // x4.c
        public int g() {
            long j6 = this.f9835b;
            if (j6 == 0) {
                return 21;
            }
            return SQLiteNDKNativeDriver.sqlc_st_step(j6);
        }

        @Override // x4.c
        public int getColumnCount() {
            long j6 = this.f9835b;
            if (j6 == 0) {
                return -1;
            }
            return SQLiteNDKNativeDriver.sqlc_st_column_count(j6);
        }

        @Override // x4.c
        public String getColumnName(int i6) {
            long j6 = this.f9835b;
            if (j6 == 0) {
                return null;
            }
            return SQLiteNDKNativeDriver.sqlc_st_column_name(j6, i6);
        }

        @Override // x4.c
        public long h(int i6) {
            long j6 = this.f9835b;
            if (j6 == 0) {
                return -1L;
            }
            return SQLiteNDKNativeDriver.sqlc_st_column_long(j6, i6);
        }

        @Override // x4.c
        public int i(int i6, String str) {
            long j6 = this.f9835b;
            if (j6 == 0) {
                return 21;
            }
            return SQLiteNDKNativeDriver.sqlc_st_bind_text_native(j6, i6, str);
        }

        @Override // x4.c
        public int j(int i6) {
            long j6 = this.f9835b;
            if (j6 == 0) {
                return -1;
            }
            return SQLiteNDKNativeDriver.sqlc_st_column_type(j6, i6);
        }

        @Override // x4.c
        public int k() {
            long j6 = this.f9835b;
            if (j6 == 0) {
                return 21;
            }
            this.f9834a = null;
            this.f9835b = 0L;
            return SQLiteNDKNativeDriver.sqlc_st_finish(j6);
        }

        @Override // x4.c
        public int l() {
            if (this.f9834a == null || this.f9835b != 0) {
                return 21;
            }
            SQLiteNDKNativeDriver.sqlc_db_prepare_st(b.this.f9833c, this.f9834a);
            throw null;
        }
    }

    public b(String str, int i6) {
        this.f9831a = str;
        this.f9832b = i6;
    }

    @Override // x4.a
    public int a() {
        long j6 = this.f9833c;
        if (j6 == 0) {
            return -1;
        }
        return SQLiteNDKNativeDriver.sqlc_db_total_changes(j6);
    }

    @Override // x4.a
    public long b() {
        long j6 = this.f9833c;
        if (j6 == 0) {
            return -1L;
        }
        return SQLiteNDKNativeDriver.sqlc_db_last_insert_rowid(j6);
    }

    @Override // x4.a
    public c c(String str) {
        if (this.f9833c == 0) {
            return null;
        }
        return new C0148b(str);
    }

    @Override // x4.a
    public int close() {
        long j6 = this.f9833c;
        if (j6 == 0) {
            return 21;
        }
        return SQLiteNDKNativeDriver.sqlc_db_close(j6);
    }

    @Override // x4.a
    public int d() {
        String str = this.f9831a;
        if (str == null || this.f9833c != 0) {
            return 21;
        }
        SQLiteNDKNativeDriver.sqlc_db_open(str, this.f9832b);
        throw null;
    }

    @Override // x4.a
    public String e() {
        long j6 = this.f9833c;
        if (j6 == 0) {
            return null;
        }
        return SQLiteNDKNativeDriver.sqlc_db_errmsg_native(j6);
    }
}
