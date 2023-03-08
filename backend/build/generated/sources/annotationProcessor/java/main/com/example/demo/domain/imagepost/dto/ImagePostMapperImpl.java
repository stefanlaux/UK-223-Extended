package com.example.demo.domain.imagepost.dto;

import com.example.demo.domain.authority.Authority;
import com.example.demo.domain.authority.dto.AuthorityDTO;
import com.example.demo.domain.imagepost.ImagePost;
import com.example.demo.domain.role.Role;
import com.example.demo.domain.role.dto.RoleDTO;
import com.example.demo.domain.user.User;
import com.example.demo.domain.user.dto.UserDTO;
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
public class ImagePostMapperImpl implements ImagePostMapper {

    @Override
    public ImagePost fromDTO(ImagePostDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ImagePost imagePost = new ImagePost();

        imagePost.setId( dto.getId() );
        imagePost.setImageUrl( dto.getImageUrl() );
        imagePost.setAuthor( userDTOToUser( dto.getAuthor() ) );
        imagePost.setDescription( dto.getDescription() );
        imagePost.setLikes( userDTOSetToUserSet( dto.getLikes() ) );

        return imagePost;
    }

    @Override
    public List<ImagePost> fromDTOs(List<ImagePostDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ImagePost> list = new ArrayList<ImagePost>( dtos.size() );
        for ( ImagePostDTO imagePostDTO : dtos ) {
            list.add( fromDTO( imagePostDTO ) );
        }

        return list;
    }

    @Override
    public Set<ImagePost> fromDTOs(Set<ImagePostDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<ImagePost> set = new LinkedHashSet<ImagePost>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( ImagePostDTO imagePostDTO : dtos ) {
            set.add( fromDTO( imagePostDTO ) );
        }

        return set;
    }

    @Override
    public ImagePostDTO toDTO(ImagePost BO) {
        if ( BO == null ) {
            return null;
        }

        ImagePostDTO imagePostDTO = new ImagePostDTO();

        imagePostDTO.setId( BO.getId() );
        imagePostDTO.setImageUrl( BO.getImageUrl() );
        imagePostDTO.setAuthor( userToUserDTO( BO.getAuthor() ) );
        imagePostDTO.setDescription( BO.getDescription() );
        imagePostDTO.setLikes( userSetToUserDTOSet( BO.getLikes() ) );

        return imagePostDTO;
    }

    @Override
    public List<ImagePostDTO> toDTOs(List<ImagePost> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<ImagePostDTO> list = new ArrayList<ImagePostDTO>( BOs.size() );
        for ( ImagePost imagePost : BOs ) {
            list.add( toDTO( imagePost ) );
        }

        return list;
    }

    @Override
    public Set<ImagePostDTO> toDTOs(Set<ImagePost> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<ImagePostDTO> set = new LinkedHashSet<ImagePostDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( ImagePost imagePost : BOs ) {
            set.add( toDTO( imagePost ) );
        }

        return set;
    }

    protected Authority authorityDTOToAuthority(AuthorityDTO authorityDTO) {
        if ( authorityDTO == null ) {
            return null;
        }

        Authority authority = new Authority();

        authority.setId( authorityDTO.getId() );
        authority.setName( authorityDTO.getName() );

        return authority;
    }

    protected Set<Authority> authorityDTOSetToAuthoritySet(Set<AuthorityDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Authority> set1 = new LinkedHashSet<Authority>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( AuthorityDTO authorityDTO : set ) {
            set1.add( authorityDTOToAuthority( authorityDTO ) );
        }

        return set1;
    }

    protected Role roleDTOToRole(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( roleDTO.getId() );
        role.setName( roleDTO.getName() );
        role.setAuthorities( authorityDTOSetToAuthoritySet( roleDTO.getAuthorities() ) );

        return role;
    }

    protected Set<Role> roleDTOSetToRoleSet(Set<RoleDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Role> set1 = new LinkedHashSet<Role>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleDTO roleDTO : set ) {
            set1.add( roleDTOToRole( roleDTO ) );
        }

        return set1;
    }

    protected User userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        user.setFirstName( userDTO.getFirstName() );
        user.setLastName( userDTO.getLastName() );
        user.setEmail( userDTO.getEmail() );
        user.setRoles( roleDTOSetToRoleSet( userDTO.getRoles() ) );

        return user;
    }

    protected Set<User> userDTOSetToUserSet(Set<UserDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<User> set1 = new LinkedHashSet<User>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( UserDTO userDTO : set ) {
            set1.add( userDTOToUser( userDTO ) );
        }

        return set1;
    }

    protected AuthorityDTO authorityToAuthorityDTO(Authority authority) {
        if ( authority == null ) {
            return null;
        }

        AuthorityDTO authorityDTO = new AuthorityDTO();

        authorityDTO.setId( authority.getId() );
        authorityDTO.setName( authority.getName() );

        return authorityDTO;
    }

    protected Set<AuthorityDTO> authoritySetToAuthorityDTOSet(Set<Authority> set) {
        if ( set == null ) {
            return null;
        }

        Set<AuthorityDTO> set1 = new LinkedHashSet<AuthorityDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Authority authority : set ) {
            set1.add( authorityToAuthorityDTO( authority ) );
        }

        return set1;
    }

    protected RoleDTO roleToRoleDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( role.getId() );
        roleDTO.setName( role.getName() );
        roleDTO.setAuthorities( authoritySetToAuthorityDTOSet( role.getAuthorities() ) );

        return roleDTO;
    }

    protected Set<RoleDTO> roleSetToRoleDTOSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleDTO> set1 = new LinkedHashSet<RoleDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleToRoleDTO( role ) );
        }

        return set1;
    }

    protected UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setFirstName( user.getFirstName() );
        userDTO.setLastName( user.getLastName() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setRoles( roleSetToRoleDTOSet( user.getRoles() ) );

        return userDTO;
    }

    protected Set<UserDTO> userSetToUserDTOSet(Set<User> set) {
        if ( set == null ) {
            return null;
        }

        Set<UserDTO> set1 = new LinkedHashSet<UserDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( User user : set ) {
            set1.add( userToUserDTO( user ) );
        }

        return set1;
    }
}
