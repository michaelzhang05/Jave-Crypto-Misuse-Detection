package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.x;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebDialogParameters.java */
/* loaded from: classes.dex */
public class c {
    public static Bundle a(ShareLinkContent shareLinkContent) {
        Bundle c2 = c(shareLinkContent);
        x.d0(c2, "href", shareLinkContent.a());
        x.c0(c2, "quote", shareLinkContent.d());
        return c2;
    }

    public static Bundle b(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle c2 = c(shareOpenGraphContent);
        x.c0(c2, "action_type", shareOpenGraphContent.d().e());
        try {
            JSONObject e2 = b.e(b.f(shareOpenGraphContent), false);
            if (e2 != null) {
                x.c0(c2, "action_properties", e2.toString());
            }
            return c2;
        } catch (JSONException e3) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e3);
        }
    }

    public static Bundle c(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag b2 = shareContent.b();
        if (b2 != null) {
            x.c0(bundle, "hashtag", b2.a());
        }
        return bundle;
    }
}
