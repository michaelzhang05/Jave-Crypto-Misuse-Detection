package io.liteglue;

/* loaded from: classes.dex */
public abstract class SQLiteNDKNativeDriver {
    public static native int sqlc_api_version_check(int i6);

    public static native int sqlc_db_close(long j6);

    public static native String sqlc_db_errmsg_native(long j6);

    public static native long sqlc_db_last_insert_rowid(long j6);

    public static native SQLiteNativeResponse sqlc_db_open(String str, int i6);

    public static native SQLiteNativeResponse sqlc_db_prepare_st(long j6, String str);

    public static native int sqlc_db_total_changes(long j6);

    public static native int sqlc_st_bind_double(long j6, int i6, double d6);

    public static native int sqlc_st_bind_long(long j6, int i6, long j7);

    public static native int sqlc_st_bind_null(long j6, int i6);

    public static native int sqlc_st_bind_text_native(long j6, int i6, String str);

    public static native int sqlc_st_column_count(long j6);

    public static native double sqlc_st_column_double(long j6, int i6);

    public static native long sqlc_st_column_long(long j6, int i6);

    public static native String sqlc_st_column_name(long j6, int i6);

    public static native String sqlc_st_column_text_native(long j6, int i6);

    public static native int sqlc_st_column_type(long j6, int i6);

    public static native int sqlc_st_finish(long j6);

    public static native int sqlc_st_step(long j6);
}
