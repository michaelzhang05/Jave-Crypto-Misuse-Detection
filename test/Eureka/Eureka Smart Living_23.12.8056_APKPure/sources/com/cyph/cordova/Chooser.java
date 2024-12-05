package com.cyph.cordova;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.cordova.a;
import org.apache.cordova.b;
import org.apache.cordova.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Chooser extends b {

    /* renamed from: c, reason: collision with root package name */
    private a f4259c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f4260d;

    public static byte[] getBytesFromInputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[65535];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static String getDisplayName(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
        if (query == null) {
            return "File";
        }
        try {
            return query.moveToFirst() ? query.getString(0) : "File";
        } finally {
            query.close();
        }
    }

    public void chooseFile(a aVar, String str, Boolean bool) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        if (!str.equals("*/*")) {
            intent.putExtra("android.intent.extra.MIME_TYPES", str.split(","));
        }
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        this.f4260d = bool;
        this.f8371cordova.startActivityForResult(this, Intent.createChooser(intent, "Select File"), 1);
        f fVar = new f(f.a.NO_RESULT);
        fVar.h(true);
        this.f4259c = aVar;
        aVar.sendPluginResult(fVar);
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, JSONArray jSONArray, a aVar) {
        try {
            if (str.equals("getFile")) {
                chooseFile(aVar, jSONArray.getString(0), Boolean.valueOf(jSONArray.getBoolean(1)));
                return true;
            }
        } catch (JSONException e6) {
            this.f4259c.error("Execute failed: " + e6.toString());
        }
        return false;
    }

    @Override // org.apache.cordova.b
    public void onActivityResult(int i6, int i7, Intent intent) {
        String str;
        if (i6 == 1) {
            try {
                a aVar = this.f4259c;
                if (aVar != null) {
                    if (i7 == -1) {
                        Uri data = intent.getData();
                        if (data == null) {
                            this.f4259c.error("File URI was null.");
                            return;
                        }
                        ContentResolver contentResolver = this.f8371cordova.getActivity().getContentResolver();
                        String displayName = getDisplayName(contentResolver, data);
                        String type = contentResolver.getType(data);
                        if (type == null || type.isEmpty()) {
                            type = "application/octet-stream";
                        }
                        String encodeToString = this.f4260d.booleanValue() ? Base64.encodeToString(getBytesFromInputStream(contentResolver.openInputStream(data)), 0) : "";
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("data", encodeToString);
                        jSONObject.put("mediaType", type);
                        jSONObject.put("name", displayName);
                        jSONObject.put("uri", data.toString());
                        aVar = this.f4259c;
                        str = jSONObject.toString();
                    } else {
                        if (i7 != 0) {
                            aVar.error(i7);
                            return;
                        }
                        str = "RESULT_CANCELED";
                    }
                    aVar.success(str);
                }
            } catch (Exception e6) {
                this.f4259c.error("Failed to read file: " + e6.toString());
            }
        }
    }
}
