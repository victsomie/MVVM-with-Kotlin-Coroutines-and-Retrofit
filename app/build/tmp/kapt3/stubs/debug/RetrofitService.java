
import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"LRetrofitService;", "", "getAllMovies", "Lretrofit2/Response;", "", "Ldemo/movieslist/mvvm/Movie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface RetrofitService {
    @org.jetbrains.annotations.NotNull()
    public static final RetrofitService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movielist.json")
    public abstract java.lang.Object getAllMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<demo.movieslist.mvvm.Movie>>> continuation);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"LRetrofitService$Companion;", "", "()V", "retrofitService", "LRetrofitService;", "getRetrofitService", "()LRetrofitService;", "setRetrofitService", "(LRetrofitService;)V", "getInstance", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.Nullable()
        private static RetrofitService retrofitService;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final RetrofitService getRetrofitService() {
            return null;
        }
        
        public final void setRetrofitService(@org.jetbrains.annotations.Nullable()
        RetrofitService p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final RetrofitService getInstance() {
            return null;
        }
    }
}