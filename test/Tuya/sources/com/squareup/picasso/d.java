package com.squareup.picasso;

import P6.L;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class d extends x {

    /* renamed from: b, reason: collision with root package name */
    private static final UriMatcher f23251b;

    /* renamed from: a, reason: collision with root package name */
    private final Context f23252a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f23251b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context) {
        this.f23252a = context;
    }

    private InputStream j(v vVar) {
        ContentResolver contentResolver = this.f23252a.getContentResolver();
        Uri uri = vVar.f23367d;
        int match = f23251b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.squareup.picasso.x
    public boolean c(v vVar) {
        Uri uri = vVar.f23367d;
        if ("content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f23251b.match(vVar.f23367d) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.squareup.picasso.x
    public x.a f(v vVar, int i8) {
        InputStream j8 = j(vVar);
        if (j8 == null) {
            return null;
        }
        return new x.a(L.l(j8), s.e.DISK);
    }
}
