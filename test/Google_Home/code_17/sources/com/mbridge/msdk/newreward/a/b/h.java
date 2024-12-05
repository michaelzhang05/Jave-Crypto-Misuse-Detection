package com.mbridge.msdk.newreward.a.b;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class h implements com.mbridge.msdk.newreward.a.b.a {

    /* loaded from: classes4.dex */
    private static final class a implements com.mbridge.msdk.foundation.same.c.c {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.a f21821a;

        /* renamed from: b, reason: collision with root package name */
        private final b f21822b;

        public a(com.mbridge.msdk.newreward.function.d.a.a aVar, b bVar) {
            this.f21821a = aVar;
            this.f21822b = bVar;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            if (this.f21822b != null && this.f21821a.h().x()) {
                this.f21822b.a(this.f21821a);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            if (this.f21822b != null && this.f21821a.h().x()) {
                this.f21822b.a(this.f21821a);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, b bVar) throws IOException {
        List<CampaignEx.c.a> a8;
        com.mbridge.msdk.newreward.function.d.a.a aVar = (com.mbridge.msdk.newreward.function.d.a.a) obj;
        CampaignEx g8 = aVar.g();
        String imageUrl = g8.getImageUrl();
        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
        com.mbridge.msdk.foundation.same.c.b.a(c8).a(imageUrl, new a(aVar, bVar));
        com.mbridge.msdk.foundation.same.c.b.a(c8).a(g8.getIconUrl(), new a(aVar, bVar));
        CampaignEx.c rewardTemplateMode = g8.getRewardTemplateMode();
        if (rewardTemplateMode == null || (a8 = rewardTemplateMode.a()) == null) {
            return;
        }
        Iterator<CampaignEx.c.a> it = a8.iterator();
        while (it.hasNext()) {
            List<String> list = it.next().f20305a;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    com.mbridge.msdk.foundation.same.c.b.a(c8).a(it2.next(), new a(aVar, bVar));
                }
            }
        }
    }
}
