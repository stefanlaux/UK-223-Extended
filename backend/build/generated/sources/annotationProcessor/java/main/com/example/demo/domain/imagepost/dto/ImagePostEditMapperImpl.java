package com.example.demo.domain.imagepost.dto;

import com.example.demo.domain.imagepost.ImagePost;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T09:45:04+0100",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class ImagePostEditMapperImpl implements ImagePostEditMapper {

    @Override
    public ImagePost fromDTO(ImagePostEditDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ImagePost imagePost = new ImagePost();

        imagePost.setId( dto.getId() );
        imagePost.setImageUrl( dto.getImageUrl() );
        imagePost.setDescription( dto.getDescription() );

        return imagePost;
    }

    @Override
    public List<ImagePost> fromDTOs(List<ImagePostEditDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ImagePost> list = new ArrayList<ImagePost>( dtos.size() );
        for ( ImagePostEditDTO imagePostEditDTO : dtos ) {
            list.add( fromDTO( imagePostEditDTO ) );
        }

        return list;
    }

    @Override
    public Set<ImagePost> fromDTOs(Set<ImagePostEditDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<ImagePost> set = new LinkedHashSet<ImagePost>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( ImagePostEditDTO imagePostEditDTO : dtos ) {
            set.add( fromDTO( imagePostEditDTO ) );
        }

        return set;
    }

    @Override
    public ImagePostEditDTO toDTO(ImagePost BO) {
        if ( BO == null ) {
            return null;
        }

        ImagePostEditDTO imagePostEditDTO = new ImagePostEditDTO();

        imagePostEditDTO.setId( BO.getId() );
        imagePostEditDTO.setImageUrl( BO.getImageUrl() );
        imagePostEditDTO.setDescription( BO.getDescription() );

        return imagePostEditDTO;
    }

    @Override
    public List<ImagePostEditDTO> toDTOs(List<ImagePost> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<ImagePostEditDTO> list = new ArrayList<ImagePostEditDTO>( BOs.size() );
        for ( ImagePost imagePost : BOs ) {
            list.add( toDTO( imagePost ) );
        }

        return list;
    }

    @Override
    public Set<ImagePostEditDTO> toDTOs(Set<ImagePost> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<ImagePostEditDTO> set = new LinkedHashSet<ImagePostEditDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( ImagePost imagePost : BOs ) {
            set.add( toDTO( imagePost ) );
        }

        return set;
    }
}
