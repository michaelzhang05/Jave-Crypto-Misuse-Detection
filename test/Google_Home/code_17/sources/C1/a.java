package C1;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public enum a {
    CLICK(CampaignEx.JSON_NATIVE_VIDEO_CLICK),
    INVITATION_ACCEPTED("invitationAccept");


    /* renamed from: a, reason: collision with root package name */
    String f1170a;

    a(String str) {
        this.f1170a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1170a;
    }
}
