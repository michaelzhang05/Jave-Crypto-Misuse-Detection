package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class w extends q {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f21144a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f21145b;

    /* renamed from: c, reason: collision with root package name */
    private final l f21146c;

    public w(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, l lVar) {
        this.f21144a = bVar;
        this.f21145b = aVar;
        this.f21146c = lVar;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i8, x xVar) {
        File file;
        FileOutputStream fileOutputStream;
        CampaignEx g8 = this.f21145b.g();
        if (TextUtils.isEmpty(g8.getMraid())) {
            xVar.b(this.f21144a, this.f21145b, this);
            return;
        }
        String a8 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
        String md5 = SameMD5.getMD5(g8.getMraid());
        if (TextUtils.isEmpty(md5)) {
            md5 = String.valueOf(System.currentTimeMillis());
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            file = new File(a8, md5.concat(".html"));
            fileOutputStream = new FileOutputStream(file);
        } catch (Exception unused) {
        }
        try {
            fileOutputStream.write(("<script>" + com.mbridge.msdk.c.b.a.a().b() + "</script>" + g8.getMraid()).getBytes());
            fileOutputStream.flush();
            g8.setMraid(file.getAbsolutePath());
        } catch (Exception unused2) {
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            g8.setMraid("");
            xVar.b(this.f21144a, this.f21145b, this);
        }
        xVar.b(this.f21144a, this.f21145b, this);
    }
}
