package nl.codebean.reactspringboot.Profile.repository;

import nl.codebean.reactspringboot.Profile.model.Profile;

import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {

}

