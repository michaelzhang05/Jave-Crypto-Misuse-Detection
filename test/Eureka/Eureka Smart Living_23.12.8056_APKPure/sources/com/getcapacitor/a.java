package com.getcapacitor;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f4263a;

    public a(Context context) {
        this.f4263a = context;
    }

    public InputStream a(String str) {
        return this.f4263a.getAssets().open(str, 2);
    }

    public InputStream b(Uri uri) {
        Integer valueOf = Integer.valueOf(uri.getPort());
        String str = uri.getScheme() + "://" + uri.getHost();
        if (valueOf.intValue() != -1) {
            str = str + ":" + valueOf;
        }
        try {
            return this.f4263a.getContentResolver().openInputStream(Uri.parse(uri.toString().replace(str + "/_capacitor_content_", "content:/")));
        } catch (SecurityException e6) {
            l0.e("Unable to open content URL: " + uri, e6);
            return null;
        }
    }

    public InputStream c(String str) {
        return new FileInputStream(new File(str.replace("/_capacitor_file_", "")));
    }
}
