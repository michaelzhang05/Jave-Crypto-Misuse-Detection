package com.flurry.android.agent;

import android.app.ActivityManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.flurry.sdk.b0;
import com.flurry.sdk.c2;
import com.flurry.sdk.d1;
import com.flurry.sdk.e7;
import com.flurry.sdk.o1;
import com.flurry.sdk.p1;
import java.util.Locale;

/* loaded from: classes2.dex */
public class FlurryContentProvider extends ContentProvider {

    /* renamed from: f, reason: collision with root package name */
    private static UriMatcher f9705f;

    /* renamed from: g, reason: collision with root package name */
    private static final long f9706g = System.nanoTime();

    /* renamed from: h, reason: collision with root package name */
    private MatrixCursor f9707h;

    public static String a(Context context) {
        return context.getApplicationContext().getPackageName() + ".FlurryContentProvider";
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        String a = a(getContext());
        UriMatcher uriMatcher = new UriMatcher(-1);
        f9705f = uriMatcher;
        uriMatcher.addURI(a, "performance", 1);
        if (!c2.g(16)) {
            d1.o("FlurryContentProvider", String.format(Locale.getDefault(), "Device SDK Version older than %d", 16));
            return true;
        }
        Runtime runtime = Runtime.getRuntime();
        ActivityManager.MemoryInfo a2 = p1.a(getContext());
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"START_TIME", "RUNTIME_USED_MEMORY", "SYSTEM_USED_MEMORY"});
        this.f9707h = matrixCursor;
        matrixCursor.newRow().add(Long.valueOf(f9706g)).add(Long.valueOf(runtime.totalMemory() - runtime.freeMemory())).add(Long.valueOf(a2.totalMem - a2.availMem));
        o1.a().b(getContext(), this.f9707h);
        b0.b(getContext());
        e7.a();
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (f9705f.match(uri) != 1) {
            return null;
        }
        return this.f9707h;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
