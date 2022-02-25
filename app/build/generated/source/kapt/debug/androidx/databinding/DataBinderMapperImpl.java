package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new demo.movieslist.mvvm.DataBinderMapperImpl());
  }
}
