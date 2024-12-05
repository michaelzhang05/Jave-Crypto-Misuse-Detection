package cm.aptoide.pt.reactions.network;

import retrofit2.Response;
import rx.m.e;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ReactionsRemoteService f6647f;

    public /* synthetic */ a(ReactionsRemoteService reactionsRemoteService) {
        this.f6647f = reactionsRemoteService;
    }

    @Override // rx.m.e
    public final Object call(Object obj) {
        ReactionsResponse mapResponse;
        mapResponse = this.f6647f.mapResponse((Response) obj);
        return mapResponse;
    }
}
